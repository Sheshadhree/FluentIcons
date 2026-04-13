package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextDescription16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDescription16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.75f, 3f)
            curveTo(1.336f, 3f, 1f, 3.336f, 1f, 3.75f)
            reflectiveCurveTo(1.336f, 4.5f, 1.75f, 4.5f)
            horizontalLineToRelative(12.5f)
            curveTo(14.664f, 4.5f, 15f, 4.164f, 15f, 3.75f)
            reflectiveCurveTo(14.664f, 3f, 14.25f, 3f)
            horizontalLineTo(1.75f)
            close()
            moveToRelative(0f, 3f)
            curveTo(1.336f, 6f, 1f, 6.336f, 1f, 6.75f)
            reflectiveCurveTo(1.336f, 7.5f, 1.75f, 7.5f)
            horizontalLineToRelative(12.5f)
            curveTo(14.664f, 7.5f, 15f, 7.164f, 15f, 6.75f)
            reflectiveCurveTo(14.664f, 6f, 14.25f, 6f)
            horizontalLineTo(1.75f)
            close()
            moveTo(1f, 9.75f)
            curveTo(1f, 9.336f, 1.336f, 9f, 1.75f, 9f)
            horizontalLineToRelative(12.5f)
            curveTo(14.664f, 9f, 15f, 9.336f, 15f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 10.5f, 1f, 10.164f, 1f, 9.75f)
            close()
            moveTo(1.75f, 12f)
            curveTo(1.336f, 12f, 1f, 12.336f, 1f, 12.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.664f, 12f, 10.25f, 12f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
