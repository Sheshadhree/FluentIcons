package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextCaseUppercase16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextCaseUppercase16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2.5f)
            curveToRelative(0.21f, 0f, 0.397f, 0.13f, 0.47f, 0.327f)
            lineToRelative(3.5f, 9.5f)
            curveToRelative(0.095f, 0.26f, -0.038f, 0.547f, -0.297f, 0.642f)
            curveToRelative(-0.26f, 0.096f, -0.547f, -0.037f, -0.642f, -0.296f)
            lineTo(6.546f, 10f)
            horizontalLineTo(2.454f)
            lineToRelative(-0.985f, 2.673f)
            curveToRelative(-0.095f, 0.259f, -0.383f, 0.392f, -0.642f, 0.296f)
            curveToRelative(-0.259f, -0.095f, -0.391f, -0.383f, -0.296f, -0.642f)
            lineToRelative(3.5f, -9.5f)
            curveTo(4.103f, 2.631f, 4.291f, 2.5f, 4.501f, 2.5f)
            close()
            moveToRelative(0f, 1.946f)
            lineTo(2.822f, 9f)
            horizontalLineToRelative(3.356f)
            lineTo(4.5f, 4.446f)
            close()
            moveToRelative(5f, -1.946f)
            curveTo(9.224f, 2.5f, 9f, 2.724f, 9f, 3f)
            verticalLineToRelative(9.5f)
            curveTo(9f, 12.776f, 9.224f, 13f, 9.5f, 13f)
            horizontalLineTo(12f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            curveToRelative(0f, -1.247f, -0.76f, -2.316f, -1.843f, -2.769f)
            curveTo(13.677f, 6.731f, 14f, 6.028f, 14f, 5.25f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineTo(9.5f)
            close()
            moveTo(13f, 5.25f)
            curveTo(13f, 6.216f, 12.216f, 7f, 11.25f, 7f)
            horizontalLineTo(10f)
            verticalLineTo(3.5f)
            horizontalLineToRelative(1.25f)
            curveTo(12.216f, 3.5f, 13f, 4.284f, 13f, 5.25f)
            close()
            moveTo(12f, 12f)
            horizontalLineToRelative(-2f)
            verticalLineTo(8f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            close()
        }
    }.build()
}
