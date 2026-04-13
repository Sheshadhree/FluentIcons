package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailProhibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailProhibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5.5f)
            curveTo(6f, 7.985f, 8.015f, 10f, 10.5f, 10f)
            reflectiveCurveTo(15f, 7.985f, 15f, 5.5f)
            reflectiveCurveTo(12.985f, 1f, 10.5f, 1f)
            reflectiveCurveTo(6f, 3.015f, 6f, 5.5f)
            close()
            moveToRelative(1f, 0f)
            curveTo(7f, 3.567f, 8.567f, 2f, 10.5f, 2f)
            curveToRelative(0.786f, 0f, 1.512f, 0.26f, 2.096f, 0.697f)
            lineToRelative(-4.9f, 4.9f)
            curveTo(7.26f, 7.011f, 7f, 6.286f, 7f, 5.5f)
            close()
            moveTo(10.5f, 9f)
            curveTo(9.714f, 9f, 8.988f, 8.74f, 8.404f, 8.303f)
            lineToRelative(4.9f, -4.9f)
            curveTo(13.74f, 3.989f, 14f, 4.714f, 14f, 5.5f)
            curveTo(14f, 7.433f, 12.433f, 9f, 10.5f, 9f)
            close()
            moveToRelative(0f, 2f)
            curveToRelative(0.9f, 0f, 1.75f, -0.216f, 2.5f, -0.6f)
            verticalLineTo(13f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(8.337f)
            lineToRelative(5.763f, 3.103f)
            curveToRelative(0.148f, 0.08f, 0.326f, 0.08f, 0.474f, 0f)
            lineToRelative(1.411f, -0.76f)
            curveTo(9.227f, 10.888f, 9.85f, 11f, 10.5f, 11f)
            close()
            moveTo(3f, 5f)
            horizontalLineToRelative(2.022f)
            curveTo(5.008f, 5.165f, 5f, 5.332f, 5f, 5.5f)
            curveToRelative(0f, 1.95f, 1.014f, 3.662f, 2.544f, 4.64f)
            lineTo(7f, 10.431f)
            lineToRelative(-6f, -3.23f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
        }
    }.build()
}
