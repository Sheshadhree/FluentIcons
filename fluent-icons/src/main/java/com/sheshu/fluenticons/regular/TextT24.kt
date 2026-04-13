package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextT24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextT24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.75f)
            curveTo(5f, 4.336f, 5.336f, 4f, 5.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(18.664f, 4f, 19f, 4.336f, 19f, 4.75f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(17.5f, 7.164f, 17.5f, 6.75f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(-4.75f)
            verticalLineToRelative(13f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(14.664f, 20f, 14.25f, 20f)
            horizontalLineToRelative(-4.5f)
            curveTo(9.336f, 20f, 9f, 19.664f, 9f, 19.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-13f)
            horizontalLineTo(6.5f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(5f, 7.164f, 5f, 6.75f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
