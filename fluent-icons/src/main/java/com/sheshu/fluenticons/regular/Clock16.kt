package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Clock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Clock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(6f, -7f)
            curveTo(4.134f, 1f, 1f, 4.134f, 1f, 8f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(0f, 3.5f)
            curveTo(8f, 4.224f, 7.776f, 4f, 7.5f, 4f)
            reflectiveCurveTo(7f, 4.224f, 7f, 4.5f)
            verticalLineToRelative(4f)
            curveTo(7f, 8.776f, 7.224f, 9f, 7.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(10.776f, 9f, 11f, 8.776f, 11f, 8.5f)
            reflectiveCurveTo(10.776f, 8f, 10.5f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}
