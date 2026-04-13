package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ListRtl20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ListRtl20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.75f)
            curveTo(6f, 4.336f, 6.336f, 4f, 6.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(17.664f, 4f, 18f, 4.336f, 18f, 4.75f)
            reflectiveCurveTo(17.664f, 5.5f, 17.25f, 5.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 5.5f, 6f, 5.164f, 6f, 4.75f)
            close()
            moveToRelative(1f, 10f)
            curveTo(7f, 14.336f, 7.336f, 14f, 7.75f, 14f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-9.5f)
            curveTo(7.336f, 15.5f, 7f, 15.164f, 7f, 14.75f)
            close()
            moveTo(2.75f, 9f)
            curveTo(2.336f, 9f, 2f, 9.336f, 2f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.664f, 9f, 17.25f, 9f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
