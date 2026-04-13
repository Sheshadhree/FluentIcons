package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailClock32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailClock32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 16.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            close()
            moveTo(22.75f, 4f)
            curveTo(22.336f, 4f, 22f, 4.336f, 22f, 4.75f)
            verticalLineToRelative(4.5f)
            curveTo(22f, 9.664f, 22.336f, 10f, 22.75f, 10f)
            horizontalLineToRelative(3.5f)
            curveTo(26.664f, 10f, 27f, 9.664f, 27f, 9.25f)
            reflectiveCurveTo(26.664f, 8.5f, 26.25f, 8.5f)
            horizontalLineTo(23.5f)
            verticalLineTo(4.75f)
            curveTo(23.5f, 4.336f, 23.164f, 4f, 22.75f, 4f)
            close()
            moveTo(14f, 9f)
            curveToRelative(0f, 2.876f, 1.349f, 5.437f, 3.448f, 7.084f)
            lineTo(16f, 16.864f)
            lineTo(3.48f, 10.123f)
            lineToRelative(-1.476f, -0.82f)
            curveTo(2.107f, 6.909f, 4.081f, 5f, 6.5f, 5f)
            horizontalLineToRelative(8.435f)
            curveTo(14.337f, 6.205f, 14f, 7.563f, 14f, 9f)
            close()
            moveToRelative(2.474f, 9.88f)
            lineToRelative(2.982f, -1.605f)
            curveTo(20.543f, 17.742f, 21.74f, 18f, 23f, 18f)
            curveToRelative(2.827f, 0f, 5.35f, -1.304f, 7f, -3.343f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineTo(11.588f)
            lineToRelative(0.514f, 0.286f)
            lineToRelative(13.012f, 7.007f)
            curveToRelative(0.296f, 0.159f, 0.652f, 0.159f, 0.948f, 0f)
            close()
        }
    }.build()
}
