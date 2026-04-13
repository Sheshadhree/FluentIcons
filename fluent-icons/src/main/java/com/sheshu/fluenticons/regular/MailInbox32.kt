package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailInbox32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailInbox32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineToRelative(17f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-17f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineToRelative(-17f)
            close()
            moveTo(5f, 7.5f)
            curveTo(5f, 6.12f, 6.12f, 5f, 7.5f, 5f)
            horizontalLineToRelative(17f)
            curveTo(25.88f, 5f, 27f, 6.12f, 27f, 7.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            verticalLineTo(7.5f)
            close()
            moveTo(5f, 18f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-17f)
            curveTo(6.12f, 27f, 5f, 25.88f, 5f, 24.5f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}
