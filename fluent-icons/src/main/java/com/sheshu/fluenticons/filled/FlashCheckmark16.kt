package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlashCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlashCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.874f, 1f)
            curveTo(3.432f, 1f, 3.042f, 1.29f, 2.916f, 1.714f)
            lineTo(1.032f, 8.036f)
            curveTo(0.888f, 8.516f, 1.249f, 9f, 1.75f, 9f)
            horizontalLineToRelative(1.584f)
            lineToRelative(-1.28f, 4.389f)
            curveToRelative(-0.384f, 1.316f, 1.324f, 2.2f, 2.178f, 1.128f)
            lineToRelative(1.306f, -1.64f)
            curveTo(5.193f, 12.156f, 5f, 11.35f, 5f, 10.5f)
            curveToRelative(0f, -2.977f, 2.366f, -5.402f, 5.32f, -5.497f)
            curveTo(10.298f, 5f, 10.275f, 5f, 10.252f, 5f)
            horizontalLineToRelative(-2.03f)
            lineToRelative(0.994f, -2.649f)
            curveTo(9.46f, 1.697f, 8.978f, 1f, 8.28f, 1f)
            horizontalLineTo(3.874f)
            close()
            moveTo(15f, 10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
            moveToRelative(-2.854f, -1.854f)
            lineTo(9.5f, 11.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            close()
        }
    }.build()
}
