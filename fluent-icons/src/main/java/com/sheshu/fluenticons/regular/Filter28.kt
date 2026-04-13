package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Filter28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Filter28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 19f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(10.336f, 19f, 10.75f, 19f)
            horizontalLineToRelative(6.5f)
            close()
            moveToRelative(4f, -6f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 14.5f, 6f, 14.164f, 6f, 13.75f)
            reflectiveCurveTo(6.336f, 13f, 6.75f, 13f)
            horizontalLineToRelative(14.5f)
            close()
            moveToRelative(3f, -6f)
            curveTo(24.664f, 7f, 25f, 7.336f, 25f, 7.75f)
            reflectiveCurveTo(24.664f, 8.5f, 24.25f, 8.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 8.5f, 3f, 8.164f, 3f, 7.75f)
            reflectiveCurveTo(3.336f, 7f, 3.75f, 7f)
            horizontalLineToRelative(20.5f)
            close()
        }
    }.build()
}
