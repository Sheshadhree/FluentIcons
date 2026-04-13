package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextT16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextT16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2.75f)
            curveTo(2.5f, 2.336f, 2.836f, 2f, 3.25f, 2f)
            horizontalLineToRelative(9f)
            curveTo(12.664f, 2f, 13f, 2.336f, 13f, 2.75f)
            verticalLineToRelative(1.5f)
            curveTo(13f, 4.664f, 12.664f, 5f, 12.25f, 5f)
            reflectiveCurveTo(11.5f, 4.664f, 11.5f, 4.25f)
            verticalLineTo(3.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(10.164f, 14f, 9.75f, 14f)
            horizontalLineToRelative(-4f)
            curveTo(5.336f, 14f, 5f, 13.664f, 5f, 13.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(7f)
            verticalLineToRelative(-9f)
            horizontalLineTo(4f)
            verticalLineToRelative(0.75f)
            curveTo(4f, 4.664f, 3.664f, 5f, 3.25f, 5f)
            reflectiveCurveTo(2.5f, 4.664f, 2.5f, 4.25f)
            verticalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
