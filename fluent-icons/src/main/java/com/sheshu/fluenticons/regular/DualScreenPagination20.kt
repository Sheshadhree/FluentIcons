package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DualScreenPagination20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenPagination20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
            moveToRelative(2f, -1f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5.5f)
            verticalLineTo(5f)
            horizontalLineTo(4f)
            close()
            moveToRelative(12f, 10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(10f)
            horizontalLineTo(16f)
            close()
            moveToRelative(-4.5f, -1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 13f, 11.5f, 13f)
            reflectiveCurveTo(11f, 13.224f, 11f, 13.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            close()
            moveToRelative(2.5f, -0.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(13f, 13.776f, 13f, 13.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            close()
            moveToRelative(1.5f, 0.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 13f, 15.5f, 13f)
            reflectiveCurveTo(15f, 13.224f, 15f, 13.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            close()
        }
    }.build()
}
