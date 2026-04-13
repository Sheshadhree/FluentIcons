package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FastForward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FastForward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.97f, 4.362f)
            curveToRelative(-0.974f, -0.828f, -2.472f, -0.136f, -2.472f, 1.143f)
            verticalLineToRelative(3.988f)
            lineToRelative(-6.027f, -5.13f)
            curveTo(4.496f, 3.534f, 2.998f, 4.227f, 2.998f, 5.506f)
            verticalLineToRelative(12.993f)
            curveToRelative(0f, 0.878f, 0.707f, 1.48f, 1.465f, 1.502f)
            horizontalLineTo(4.55f)
            curveToRelative(0.318f, -0.01f, 0.64f, -0.122f, 0.92f, -0.36f)
            lineToRelative(6.028f, -5.13f)
            verticalLineToRelative(3.987f)
            curveToRelative(0f, 1.279f, 1.498f, 1.971f, 2.472f, 1.142f)
            lineToRelative(7.41f, -6.306f)
            curveToRelative(0.821f, -0.699f, 0.821f, -1.966f, 0f, -2.665f)
            lineToRelative(-7.41f, -6.307f)
            close()
        }
    }.build()
}
