package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            curveToRelative(0f, 2.08f, 0.748f, 3.987f, 1.99f, 5.465f)
            lineToRelative(4.934f, -4.843f)
            curveToRelative(0.875f, -0.859f, 2.277f, -0.859f, 3.152f, 0f)
            lineToRelative(4.935f, 4.843f)
            curveTo(19.752f, 15.987f, 20.5f, 14.08f, 20.5f, 12f)
            curveToRelative(0f, -4.694f, -3.806f, -8.5f, -8.5f, -8.5f)
            close()
            moveToRelative(5.449f, 15.024f)
            lineToRelative(-4.924f, -4.832f)
            curveToRelative(-0.291f, -0.286f, -0.759f, -0.286f, -1.05f, 0f)
            lineTo(6.55f, 18.524f)
            curveTo(8.026f, 19.758f, 9.927f, 20.5f, 12f, 20.5f)
            reflectiveCurveToRelative(3.974f, -0.742f, 5.449f, -1.976f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            close()
            moveToRelative(13.25f, -2.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(14.836f, 8f, 15.25f, 8f)
            reflectiveCurveTo(16f, 8.336f, 16f, 8.75f)
            reflectiveCurveTo(15.664f, 9.5f, 15.25f, 9.5f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            reflectiveCurveTo(16.493f, 6.5f, 15.25f, 6.5f)
            reflectiveCurveTo(13f, 7.507f, 13f, 8.75f)
            reflectiveCurveTo(14.007f, 11f, 15.25f, 11f)
            close()
        }
    }.build()
}
