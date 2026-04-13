package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle448: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle448",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 24f)
            curveToRelative(0f, -9.665f, 7.835f, -17.5f, 17.5f, -17.5f)
            reflectiveCurveTo(41.5f, 14.335f, 41.5f, 24f)
            reflectiveCurveTo(33.665f, 41.5f, 24f, 41.5f)
            reflectiveCurveTo(6.5f, 33.665f, 6.5f, 24f)
            close()
            moveTo(24f, 4f)
            curveTo(12.954f, 4f, 4f, 12.954f, 4f, 24f)
            reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
            reflectiveCurveToRelative(20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            close()
            moveToRelative(3.5f, 10.58f)
            curveToRelative(0f, -1.636f, -2.124f, -2.274f, -3.026f, -0.91f)
            lineToRelative(-9.209f, 13.925f)
            curveTo(14.584f, 28.625f, 15.323f, 30f, 16.558f, 30f)
            horizontalLineTo(25f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(30f)
            horizontalLineToRelative(2.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(27.5f)
            verticalLineTo(14.58f)
            close()
            moveTo(25f, 17.406f)
            verticalLineTo(27.5f)
            horizontalLineToRelative(-6.675f)
            lineTo(25f, 17.406f)
            close()
        }
    }.build()
}
