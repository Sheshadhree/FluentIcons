package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CenterVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CenterVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 3.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 4.5f, 3f, 4.164f, 3f, 3.75f)
            reflectiveCurveTo(3.336f, 3f, 3.75f, 3f)
            horizontalLineToRelative(16.5f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            close()
            moveToRelative(0f, 16.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            close()
            moveTo(7.25f, 8f)
            curveTo(6.007f, 8f, 5f, 9.007f, 5f, 10.25f)
            verticalLineToRelative(3.5f)
            curveTo(5f, 14.993f, 6.007f, 16f, 7.25f, 16f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-3.5f)
            curveTo(19f, 9.007f, 17.993f, 8f, 16.75f, 8f)
            horizontalLineToRelative(-9.5f)
            close()
            moveTo(6.5f, 10.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-9.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
