package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationAdd24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationAdd24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.97f, 18.056f)
            lineToRelative(1.187f, -1.174f)
            curveToRelative(3.4f, -3.4f, 3.4f, -8.914f, 0f, -12.314f)
            curveToRelative(-3.4f, -3.4f, -8.913f, -3.4f, -12.314f, 0f)
            curveToRelative(-3.4f, 3.4f, -3.4f, 8.914f, 0f, 12.314f)
            curveToRelative(0.296f, 0.296f, 0.663f, 0.659f, 1.102f, 1.09f)
            lineToRelative(3.491f, 3.396f)
            curveToRelative(0.872f, 0.843f, 2.256f, 0.843f, 3.128f, 0f)
            curveToRelative(1.396f, -1.35f, 2.531f, -2.454f, 3.406f, -3.312f)
            close()
            moveTo(12f, 7f)
            curveToRelative(0.414f, 0f, 0.75f, 0.335f, 0.75f, 0.75f)
            verticalLineTo(10f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.335f, 0.75f, 0.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(11.5f)
            horizontalLineToRelative(-2.5f)
            curveTo(8.336f, 11.5f, 8f, 11.164f, 8f, 10.75f)
            curveTo(8f, 10.335f, 8.336f, 10f, 8.75f, 10f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(7.75f)
            curveTo(11.25f, 7.335f, 11.586f, 7f, 12f, 7f)
            close()
        }
    }.build()
}
