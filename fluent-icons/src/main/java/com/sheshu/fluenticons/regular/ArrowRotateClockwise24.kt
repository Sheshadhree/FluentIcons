package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRotateClockwise24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRotateClockwise24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3f)
            curveToRelative(4.97f, 0f, 9f, 4.03f, 9f, 9f)
            curveToRelative(0f, 3.078f, -1.56f, 5.865f, -4.023f, 7.5f)
            horizontalLineToRelative(1.773f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(18.75f, 21f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(14f, 20.25f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(15.5f, 16.25f)
            lineToRelative(0.001f, 2.385f)
            curveToRelative(2.423f, -1.28f, 3.999f, -3.81f, 3.999f, -6.635f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(3f, 12.414f, 3f, 12f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            close()
            moveToRelative(0f, 6.25f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveToRelative(-1.231f, 2.75f, -2.75f, 2.75f)
            reflectiveCurveTo(9.25f, 13.519f, 9.25f, 12f)
            reflectiveCurveTo(10.481f, 9.25f, 12f, 9.25f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            close()
        }
    }.build()
}
