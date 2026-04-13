package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineHorizontal1Dot20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal1Dot20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.25f, 10.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(3.94f, 8.25f, 3.25f, 8.25f)
            reflectiveCurveTo(2f, 8.81f, 2f, 9.5f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(8.44f, 10.75f, 9f, 10.19f, 9f, 9.5f)
            reflectiveCurveTo(8.44f, 8.25f, 7.75f, 8.25f)
            reflectiveCurveTo(6.5f, 8.81f, 6.5f, 9.5f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
            moveToRelative(4.5f, 0f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveTo(11f, 8.81f, 11f, 9.5f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
            moveTo(18f, 9.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(15.5f, 10.19f, 15.5f, 9.5f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveTo(18f, 8.81f, 18f, 9.5f)
            close()
        }
    }.build()
}
