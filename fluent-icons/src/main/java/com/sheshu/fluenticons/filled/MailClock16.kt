package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailClock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailClock16",
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
            moveTo(10.5f, 3f)
            curveTo(10.224f, 3f, 10f, 3.224f, 10f, 3.5f)
            verticalLineToRelative(2f)
            curveTo(10f, 5.776f, 10.224f, 6f, 10.5f, 6f)
            horizontalLineTo(12f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.276f, 5f, 12f, 5f)
            horizontalLineToRelative(-1f)
            verticalLineTo(3.5f)
            curveTo(11f, 3.224f, 10.776f, 3f, 10.5f, 3f)
            close()
            moveToRelative(0f, 8f)
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
