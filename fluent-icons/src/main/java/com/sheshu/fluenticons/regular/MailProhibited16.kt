package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailProhibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailProhibited16",
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
            moveToRelative(1.5f, 4f)
            verticalLineToRelative(-2.207f)
            curveToRelative(0.349f, -0.099f, 0.683f, -0.23f, 1f, -0.393f)
            verticalLineTo(13f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2.022f)
            curveTo(5.008f, 5.165f, 5f, 5.332f, 5f, 5.5f)
            curveTo(5f, 5.668f, 5.008f, 5.835f, 5.022f, 6f)
            horizontalLineTo(3f)
            curveTo(2.448f, 6f, 2f, 6.448f, 2f, 7f)
            verticalLineToRelative(0.74f)
            lineToRelative(5f, 2.692f)
            lineToRelative(0.544f, -0.293f)
            curveToRelative(0.344f, 0.22f, 0.714f, 0.402f, 1.104f, 0.542f)
            lineToRelative(-1.41f, 0.76f)
            curveToRelative(-0.149f, 0.079f, -0.327f, 0.079f, -0.475f, 0f)
            lineTo(2f, 8.874f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
