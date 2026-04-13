package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rhombus48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rhombus48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.007f, 11.042f)
            curveToRelative(0.707f, -1.832f, 2.468f, -3.04f, 4.432f, -3.04f)
            horizontalLineToRelative(23.807f)
            curveToRelative(3.336f, 0f, 5.632f, 3.348f, 4.431f, 6.46f)
            lineToRelative(-8.684f, 22.5f)
            curveTo(35.286f, 38.791f, 33.525f, 40f, 31.562f, 40f)
            horizontalLineTo(7.754f)
            curveToRelative(-3.335f, 0f, -5.632f, -3.348f, -4.43f, -6.46f)
            lineToRelative(8.683f, -22.5f)
            close()
        }
    }.build()
}
