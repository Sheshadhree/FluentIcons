package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceOof10: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceOof10",
        defaultWidth = 10.dp,
        defaultHeight = 10.dp,
        viewportWidth = 10f,
        viewportHeight = 10f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.349f, 3.85f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.706f)
            curveToRelative(-0.196f, -0.195f, -0.513f, -0.195f, -0.708f, 0f)
            lineToRelative(-1.497f, 1.5f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(1.497f, 1.5f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.196f, 0.707f, 0f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            lineTo(4.704f, 5.498f)
            horizontalLineToRelative(1.8f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -0.277f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-1.8f)
            lineTo(5.35f, 3.85f)
            close()
            moveTo(4.998f, 0f)
            curveTo(2.238f, 0f, 0f, 2.237f, 0f, 4.998f)
            curveToRelative(0f, 2.76f, 2.237f, 4.997f, 4.998f, 4.997f)
            curveToRelative(2.76f, 0f, 4.997f, -2.237f, 4.997f, -4.997f)
            reflectiveCurveTo(7.758f, 0f, 4.998f, 0f)
            close()
            moveTo(1f, 4.998f)
            curveTo(1f, 2.79f, 2.79f, 1f, 4.998f, 1f)
            reflectiveCurveToRelative(3.997f, 1.79f, 3.997f, 3.998f)
            reflectiveCurveToRelative(-1.79f, 3.997f, -3.997f, 3.997f)
            curveTo(2.79f, 8.995f, 1f, 7.205f, 1f, 4.998f)
            close()
        }
    }.build()
}
