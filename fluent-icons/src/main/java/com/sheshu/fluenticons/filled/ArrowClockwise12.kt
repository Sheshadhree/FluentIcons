package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowClockwise12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowClockwise12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 2f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(9f, 1.586f, 9f, 2f)
            verticalLineToRelative(0.646f)
            curveTo(8.204f, 1.933f, 7.152f, 1.5f, 6f, 1.5f)
            curveTo(3.515f, 1.5f, 1.5f, 3.515f, 1.5f, 6f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            curveToRelative(2.194f, 0f, 4.021f, -1.57f, 4.42f, -3.648f)
            curveTo(10.507f, 6.387f, 10.115f, 6f, 9.642f, 6f)
            curveToRelative(-0.354f, 0f, -0.635f, 0.291f, -0.71f, 0.638f)
            curveTo(8.639f, 7.988f, 7.438f, 9f, 6f, 9f)
            curveTo(4.343f, 9f, 3f, 7.657f, 3f, 6f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            curveToRelative(0.617f, 0f, 1.19f, 0.186f, 1.666f, 0.505f)
            horizontalLineTo(7.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2f)
            close()
        }
    }.build()
}
