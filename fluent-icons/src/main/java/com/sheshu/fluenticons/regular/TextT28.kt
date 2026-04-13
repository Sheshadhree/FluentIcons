package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextT28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextT28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.75f)
            curveTo(5f, 4.336f, 5.336f, 4f, 5.75f, 4f)
            horizontalLineToRelative(16.5f)
            curveTo(22.664f, 4f, 23f, 4.336f, 23f, 4.75f)
            verticalLineToRelative(3.5f)
            curveTo(23f, 8.664f, 22.664f, 9f, 22.25f, 9f)
            reflectiveCurveTo(21.5f, 8.664f, 21.5f, 8.25f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(-6.75f)
            verticalLineToRelative(17f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(16.664f, 24f, 16.25f, 24f)
            horizontalLineToRelative(-4.5f)
            curveTo(11.336f, 24f, 11f, 23.664f, 11f, 23.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-17f)
            horizontalLineTo(6.5f)
            verticalLineToRelative(2.75f)
            curveTo(6.5f, 8.664f, 6.164f, 9f, 5.75f, 9f)
            reflectiveCurveTo(5f, 8.664f, 5f, 8.25f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
