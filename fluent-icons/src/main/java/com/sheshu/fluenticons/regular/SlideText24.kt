package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlideText24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideText24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 8f)
            curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
            reflectiveCurveTo(6.336f, 9.5f, 6.75f, 9.5f)
            horizontalLineToRelative(4.5f)
            curveTo(11.664f, 9.5f, 12f, 9.164f, 12f, 8.75f)
            reflectiveCurveTo(11.664f, 8f, 11.25f, 8f)
            horizontalLineToRelative(-4.5f)
            close()
            moveTo(6f, 11.75f)
            curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
            close()
            moveTo(6.75f, 14f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.664f, 14f, 13.25f, 14f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(-2f, -10f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(3.5f, 6.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(4.75f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(6.75f)
            close()
        }
    }.build()
}
