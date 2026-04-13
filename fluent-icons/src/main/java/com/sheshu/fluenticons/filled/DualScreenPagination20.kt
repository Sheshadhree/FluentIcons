package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DualScreenPagination20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenPagination20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 16f)
            horizontalLineToRelative(-5.5f)
            verticalLineTo(4f)
            horizontalLineTo(16f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            close()
            moveTo(4f, 4f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(12f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(8.5f, 10f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 13f, 12.5f, 13f)
            reflectiveCurveTo(12f, 13.224f, 12f, 13.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            close()
            moveToRelative(2.5f, -0.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(14f, 13.224f, 14f, 13.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            close()
            moveToRelative(1.5f, 0.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 13f, 16.5f, 13f)
            reflectiveCurveTo(16f, 13.224f, 16f, 13.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            close()
        }
    }.build()
}
