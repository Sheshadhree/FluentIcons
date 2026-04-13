package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextColorAccent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColorAccent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 13.125f)
            curveToRelative(0f, -0.345f, 0.243f, -0.625f, 0.542f, -0.625f)
            horizontalLineToRelative(11.916f)
            curveToRelative(0.3f, 0f, 0.542f, 0.28f, 0.542f, 0.625f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.345f, -0.242f, 0.625f, -0.542f, 0.625f)
            horizontalLineTo(4.042f)
            curveToRelative(-0.3f, 0f, -0.542f, -0.28f, -0.542f, -0.625f)
            verticalLineToRelative(-3.75f)
            close()
        }
    }.build()
}
