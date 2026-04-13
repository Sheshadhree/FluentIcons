package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideSize24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideSize24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(14.5f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveToRelative(14.78f, 0.47f)
            curveTo(16.64f, 7.079f, 16.45f, 7f, 16.25f, 7f)
            horizontalLineToRelative(-2.5f)
            curveTo(13.334f, 7f, 13f, 7.336f, 13f, 7.75f)
            reflectiveCurveToRelative(0.335f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(0.69f)
            lineToRelative(-1.72f, 1.719f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(0.292f, 0.294f, 0.767f, 0.294f, 1.06f, 0f)
            lineTo(15.5f, 9.56f)
            verticalLineToRelative(0.69f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.199f, -0.078f, -0.39f, -0.22f, -0.53f)
            close()
            moveTo(7.75f, 17f)
            horizontalLineToRelative(2.501f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-0.69f)
            lineToRelative(1.72f, -1.72f)
            curveToRelative(0.292f, -0.293f, 0.292f, -0.768f, 0f, -1.061f)
            curveToRelative(-0.294f, -0.293f, -0.769f, -0.293f, -1.061f, 0f)
            lineTo(8.5f, 14.44f)
            verticalLineToRelative(-0.69f)
            curveTo(8.5f, 13.337f, 8.164f, 13f, 7.75f, 13f)
            reflectiveCurveTo(7f, 13.337f, 7f, 13.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.2f, 0.079f, 0.39f, 0.22f, 0.531f)
            curveTo(7.36f, 16.92f, 7.55f, 17f, 7.75f, 17f)
            close()
        }
    }.build()
}
