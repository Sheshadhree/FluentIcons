package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Book32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Book32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(14f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(18f)
            horizontalLineTo(7f)
            verticalLineTo(6f)
            close()
            moveToRelative(2f, 22f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            horizontalLineToRelative(18.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineTo(9f)
            curveTo(6.79f, 2f, 5f, 3.79f, 5f, 6f)
            verticalLineToRelative(20f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(17f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(9f)
            close()
            moveToRelative(1.75f, -22f)
            curveTo(9.784f, 6f, 9f, 6.784f, 9f, 7.75f)
            verticalLineToRelative(2.5f)
            curveTo(9f, 11.216f, 9.784f, 12f, 10.75f, 12f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-2.5f)
            curveTo(23f, 6.784f, 22.216f, 6f, 21.25f, 6f)
            horizontalLineToRelative(-10.5f)
            close()
            moveTo(11f, 10f)
            verticalLineTo(8f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(2f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}
