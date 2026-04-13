package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hexagon24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hexagon24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.157f, 4.125f)
            curveTo(6.559f, 3.43f, 7.3f, 3f, 8.105f, 3f)
            horizontalLineToRelative(7.79f)
            curveToRelative(0.804f, 0f, 1.547f, 0.429f, 1.95f, 1.125f)
            lineToRelative(3.895f, 6.75f)
            curveToRelative(0.401f, 0.696f, 0.401f, 1.554f, 0f, 2.25f)
            lineToRelative(-3.896f, 6.75f)
            curveTo(17.442f, 20.57f, 16.7f, 21f, 15.895f, 21f)
            horizontalLineToRelative(-7.79f)
            curveToRelative(-0.804f, 0f, -1.546f, -0.429f, -1.948f, -1.125f)
            lineToRelative(-3.896f, -6.75f)
            curveToRelative(-0.402f, -0.696f, -0.402f, -1.554f, 0f, -2.25f)
            lineToRelative(3.896f, -6.75f)
            close()
            moveTo(8.105f, 4.5f)
            curveToRelative(-0.268f, 0f, -0.515f, 0.143f, -0.65f, 0.375f)
            lineToRelative(-3.895f, 6.75f)
            curveToRelative(-0.134f, 0.232f, -0.134f, 0.518f, 0f, 0.75f)
            lineToRelative(3.896f, 6.75f)
            curveTo(7.59f, 19.357f, 7.837f, 19.5f, 8.106f, 19.5f)
            horizontalLineToRelative(7.79f)
            curveToRelative(0.267f, 0f, 0.515f, -0.143f, 0.649f, -0.375f)
            lineToRelative(3.895f, -6.75f)
            curveToRelative(0.134f, -0.232f, 0.134f, -0.518f, 0f, -0.75f)
            lineToRelative(-3.895f, -6.75f)
            curveTo(16.41f, 4.643f, 16.163f, 4.5f, 15.895f, 4.5f)
            horizontalLineToRelative(-7.79f)
            close()
        }
    }.build()
}
