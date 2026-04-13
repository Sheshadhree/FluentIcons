package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 5.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 7.985f, 6f, 5.5f)
            reflectiveCurveTo(8.015f, 1f, 10.5f, 1f)
            reflectiveCurveTo(15f, 3.015f, 15f, 5.5f)
            close()
            moveToRelative(-4f, -2f)
            curveTo(11f, 3.224f, 10.776f, 3f, 10.5f, 3f)
            reflectiveCurveTo(10f, 3.224f, 10f, 3.5f)
            verticalLineTo(5f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 5f, 8f, 5.224f, 8f, 5.5f)
            reflectiveCurveTo(8.224f, 6f, 8.5f, 6f)
            horizontalLineTo(10f)
            verticalLineToRelative(1.5f)
            curveTo(10f, 7.776f, 10.224f, 8f, 10.5f, 8f)
            reflectiveCurveTo(11f, 7.776f, 11f, 7.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(1.5f)
            curveTo(12.776f, 6f, 13f, 5.776f, 13f, 5.5f)
            reflectiveCurveTo(12.776f, 5f, 12.5f, 5f)
            horizontalLineTo(11f)
            verticalLineTo(3.5f)
            close()
            moveTo(10.5f, 11f)
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
