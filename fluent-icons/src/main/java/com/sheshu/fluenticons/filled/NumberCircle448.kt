package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle448: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle448",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 44f)
            curveToRelative(11.046f, 0f, 20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            reflectiveCurveTo(4f, 12.954f, 4f, 24f)
            reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
            close()
            moveToRelative(3.5f, -29.42f)
            verticalLineTo(27.5f)
            horizontalLineToRelative(2.25f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(30.44f, 30f, 29.75f, 30f)
            horizontalLineTo(27.5f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(25f, 33.44f, 25f, 32.75f)
            verticalLineTo(30f)
            horizontalLineToRelative(-8.442f)
            curveToRelative(-1.235f, 0f, -1.974f, -1.375f, -1.293f, -2.405f)
            lineToRelative(9.209f, -13.925f)
            curveToRelative(0.902f, -1.364f, 3.026f, -0.726f, 3.026f, 0.91f)
            close()
            moveTo(25f, 17.406f)
            verticalLineTo(27.5f)
            horizontalLineToRelative(-6.675f)
            lineTo(25f, 17.406f)
            close()
        }
    }.build()
}
