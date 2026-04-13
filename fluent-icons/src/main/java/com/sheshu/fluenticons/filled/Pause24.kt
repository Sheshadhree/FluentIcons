package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pause24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pause24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.746f, 3f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.967f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.966f, -0.783f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(9f, 0f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.967f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.966f, -0.783f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
