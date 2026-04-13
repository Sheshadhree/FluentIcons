package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextField24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextField24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 4.679f, 3.679f, 3f, 5.75f, 3f)
            horizontalLineToRelative(12.5f)
            curveTo(20.321f, 3f, 22f, 4.679f, 22f, 6.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 21f, 2f, 19.321f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(12.75f, 7.5f)
            horizontalLineToRelative(2.75f)
            verticalLineToRelative(0.75f)
            curveTo(15.5f, 8.664f, 15.836f, 9f, 16.25f, 9f)
            reflectiveCurveTo(17f, 8.664f, 17f, 8.25f)
            verticalLineToRelative(-1.5f)
            curveTo(17f, 6.336f, 16.664f, 6f, 16.25f, 6f)
            horizontalLineToRelative(-8.5f)
            curveTo(7.336f, 6f, 7f, 6.336f, 7f, 6.75f)
            verticalLineToRelative(1.5f)
            curveTo(7f, 8.664f, 7.336f, 9f, 7.75f, 9f)
            reflectiveCurveTo(8.5f, 8.664f, 8.5f, 8.25f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(2.75f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(10.336f, 18f, 10.75f, 18f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-9f)
            close()
        }
    }.build()
}
