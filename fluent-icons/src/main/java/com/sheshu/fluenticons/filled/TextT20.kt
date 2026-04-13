package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextT20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextT20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.75f)
            curveTo(4f, 3.336f, 4.336f, 3f, 4.75f, 3f)
            horizontalLineToRelative(10f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(1.5f)
            curveTo(15.5f, 5.664f, 15.164f, 6f, 14.75f, 6f)
            reflectiveCurveTo(14f, 5.664f, 14f, 5.25f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(12.164f, 17f, 11.75f, 17f)
            horizontalLineToRelative(-4f)
            curveTo(7.336f, 17f, 7f, 16.664f, 7f, 16.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(9f)
            verticalLineToRelative(-11f)
            horizontalLineTo(5.5f)
            verticalLineToRelative(0.75f)
            curveTo(5.5f, 5.664f, 5.164f, 6f, 4.75f, 6f)
            reflectiveCurveTo(4f, 5.664f, 4f, 5.25f)
            verticalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
