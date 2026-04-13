package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareDovetailJoint20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareDovetailJoint20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 11.75f)
            curveToRelative(0f, -0.164f, 0.08f, -0.317f, 0.215f, -0.411f)
            curveToRelative(0.135f, -0.093f, 0.306f, -0.114f, 0.461f, -0.057f)
            lineTo(12f, 12.528f)
            verticalLineTo(7.467f)
            lineTo(8.673f, 8.696f)
            curveTo(8.522f, 8.754f, 8.348f, 8.731f, 8.214f, 8.637f)
            reflectiveCurveTo(8f, 8.39f, 8f, 8.227f)
            verticalLineTo(3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-5.25f)
            close()
            moveTo(14f, 3f)
            horizontalLineTo(9f)
            verticalLineToRelative(4.51f)
            lineToRelative(3.327f, -1.229f)
            curveToRelative(0.149f, -0.056f, 0.324f, -0.036f, 0.459f, 0.059f)
            curveTo(12.92f, 6.433f, 13f, 6.587f, 13f, 6.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.164f, -0.08f, 0.317f, -0.215f, 0.411f)
            curveToRelative(-0.136f, 0.094f, -0.306f, 0.114f, -0.461f, 0.057f)
            lineTo(9f, 12.472f)
            verticalLineTo(17f)
            horizontalLineToRelative(5f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
        }
    }.build()
}
