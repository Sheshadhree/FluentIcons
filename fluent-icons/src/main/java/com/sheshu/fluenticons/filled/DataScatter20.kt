package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataScatter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataScatter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 2f)
            curveTo(3.164f, 2f, 3.5f, 2.336f, 3.5f, 2.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(17.664f, 18f, 17.25f, 18f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 18f, 2f, 16.769f, 2f, 15.25f)
            verticalLineTo(2.75f)
            curveTo(2f, 2.336f, 2.336f, 2f, 2.75f, 2f)
            close()
            moveTo(10f, 7.5f)
            curveTo(10f, 8.88f, 8.88f, 10f, 7.5f, 10f)
            reflectiveCurveTo(5f, 8.88f, 5f, 7.5f)
            reflectiveCurveTo(6.12f, 5f, 7.5f, 5f)
            reflectiveCurveTo(10f, 6.12f, 10f, 7.5f)
            close()
            moveTo(14.5f, 8f)
            curveTo(15.88f, 8f, 17f, 6.88f, 17f, 5.5f)
            reflectiveCurveTo(15.88f, 3f, 14.5f, 3f)
            reflectiveCurveTo(12f, 4.12f, 12f, 5.5f)
            reflectiveCurveTo(13.12f, 8f, 14.5f, 8f)
            close()
            moveToRelative(0.5f, 4.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(10f, 13.88f, 10f, 12.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.build()
}
