package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AddSquareMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AddSquareMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 7f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-2f)
            curveTo(6.5f, 4.224f, 6.724f, 4f, 7f, 4f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            curveTo(9.776f, 6.5f, 10f, 6.724f, 10f, 7f)
            reflectiveCurveTo(9.776f, 7.5f, 9.5f, 7.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            curveTo(7.5f, 9.776f, 7.276f, 10f, 7f, 10f)
            reflectiveCurveTo(6.5f, 9.776f, 6.5f, 9.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-2f)
            curveTo(4.224f, 7.5f, 4f, 7.276f, 4f, 7f)
            close()
            moveToRelative(0f, -5f)
            curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveTo(3f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(4f)
            close()
            moveToRelative(7.5f, 9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(3.268f)
            curveTo(13.598f, 3.613f, 14f, 4.26f, 14f, 5f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(5f)
            curveToRelative(-0.74f, 0f, -1.387f, -0.402f, -1.732f, -1f)
            horizontalLineTo(10.5f)
            close()
        }
    }.build()
}
