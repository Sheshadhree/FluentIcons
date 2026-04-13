package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PaintBrush20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaintBrush20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 1.999f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(8.504f)
            curveToRelative(0f, 1.105f, 0.896f, 2f, 2f, 2f)
            horizontalLineToRelative(1.004f)
            verticalLineToRelative(2.998f)
            curveToRelative(0f, 1.104f, 0.896f, 2f, 2f, 2f)
            curveToRelative(1.105f, 0f, 2f, -0.896f, 2f, -2f)
            verticalLineToRelative(-2.998f)
            horizontalLineTo(13f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(2.5f)
            curveTo(15f, 2.224f, 14.776f, 2f, 14.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(6f, 10.003f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.553f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-1.496f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(3.498f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3.498f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, -0.447f, -1f, -1f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(8f, -1f)
            horizontalLineTo(6f)
            verticalLineTo(3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            curveTo(10f, 4.776f, 10.224f, 5f, 10.5f, 5f)
            reflectiveCurveTo(11f, 4.776f, 11f, 4.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2.502f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(6.004f)
            close()
        }
    }.build()
}
