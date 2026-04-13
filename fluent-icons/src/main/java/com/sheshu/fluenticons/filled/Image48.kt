package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Image48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Image48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 6f)
            curveTo(8.798f, 6f, 6f, 8.798f, 6f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 1.356f, 0.432f, 2.61f, 1.165f, 3.635f)
            lineToRelative(14.36f, -14.36f)
            curveToRelative(1.367f, -1.367f, 3.583f, -1.367f, 4.95f, 0f)
            lineToRelative(14.36f, 14.36f)
            curveTo(41.568f, 38.361f, 42f, 37.105f, 42f, 35.75f)
            verticalLineToRelative(-23.5f)
            curveTo(42f, 8.798f, 39.202f, 6f, 35.75f, 6f)
            horizontalLineToRelative(-23.5f)
            close()
            moveTo(34.5f, 17.5f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
            moveToRelative(4.502f, 23.588f)
            lineTo(24.707f, 26.793f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(8.998f, 41.088f)
            curveTo(9.945f, 41.667f, 11.058f, 42f, 12.25f, 42f)
            horizontalLineToRelative(23.5f)
            curveToRelative(1.191f, 0f, 2.305f, -0.333f, 3.252f, -0.912f)
            close()
        }
    }.build()
}
