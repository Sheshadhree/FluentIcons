package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CenterHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CenterHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3.75f)
            curveTo(4.5f, 3.336f, 4.164f, 3f, 3.75f, 3f)
            reflectiveCurveTo(3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(16.5f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(3.75f)
            close()
            moveToRelative(15f, 0f)
            curveTo(19.5f, 3.336f, 19.836f, 3f, 20.25f, 3f)
            reflectiveCurveTo(21f, 3.336f, 21f, 3.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(3.75f)
            close()
            moveTo(10.25f, 5f)
            curveTo(9.007f, 5f, 8f, 6.007f, 8f, 7.25f)
            verticalLineToRelative(9.5f)
            curveTo(8f, 17.993f, 9.007f, 19f, 10.25f, 19f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-9.5f)
            curveTo(16f, 6.007f, 14.993f, 5f, 13.75f, 5f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(9.5f, 7.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
