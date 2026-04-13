package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleImage28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleImage28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.25f, 10f)
            horizontalLineToRelative(3.734f)
            curveToRelative(-0.258f, -3.909f, -3.51f, -7f, -7.484f, -7f)
            curveTo(6.358f, 3f, 3f, 6.358f, 3f, 10.5f)
            curveToRelative(0f, 3.974f, 3.091f, 7.226f, 7f, 7.484f)
            verticalLineTo(14.25f)
            curveToRelative(0f, -2.347f, 1.903f, -4.25f, 4.25f, -4.25f)
            close()
            moveToRelative(0f, 1f)
            curveTo(12.455f, 11f, 11f, 12.455f, 11f, 14.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.626f, 0.177f, 1.21f, 0.483f, 1.706f)
            lineToRelative(4.75f, -4.749f)
            curveToRelative(0.976f, -0.976f, 2.558f, -0.976f, 3.535f, 0f)
            lineToRelative(4.749f, 4.75f)
            curveTo(24.823f, 22.96f, 25f, 22.375f, 25f, 21.75f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-7.5f)
            close()
            moveToRelative(9.206f, 13.517f)
            lineToRelative(-4.749f, -4.75f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-4.75f, 4.75f)
            curveTo(13.04f, 24.823f, 13.625f, 25f, 14.25f, 25f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.626f, 0f, 1.21f, -0.177f, 1.706f, -0.483f)
            close()
            moveTo(22f, 15.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(19f, 16.328f, 19f, 15.5f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
