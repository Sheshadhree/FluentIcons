package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Filter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Filter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 13.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(12.664f, 15f, 12.25f, 15f)
            horizontalLineToRelative(-4.5f)
            curveTo(7.336f, 15f, 7f, 14.664f, 7f, 14.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(4.5f)
            close()
            moveToRelative(2f, -4.25f)
            curveTo(14.664f, 9.25f, 15f, 9.586f, 15f, 10f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(5.336f, 10.75f, 5f, 10.414f, 5f, 10f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(8.5f)
            close()
            moveToRelative(2f, -4.25f)
            curveTo(16.664f, 5f, 17f, 5.336f, 17f, 5.75f)
            reflectiveCurveTo(16.664f, 6.5f, 16.25f, 6.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 6.5f, 3f, 6.164f, 3f, 5.75f)
            reflectiveCurveTo(3.336f, 5f, 3.75f, 5f)
            horizontalLineToRelative(12.5f)
            close()
        }
    }.build()
}
