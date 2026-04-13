package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Timer48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Timer48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.25f, 5f)
            curveTo(18.56f, 5f, 18f, 5.56f, 18f, 6.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(9.5f)
            curveTo(29.44f, 7.5f, 30f, 6.94f, 30f, 6.25f)
            reflectiveCurveTo(29.44f, 5f, 28.75f, 5f)
            horizontalLineToRelative(-9.5f)
            close()
            moveTo(7f, 27f)
            curveToRelative(0f, -9.389f, 7.611f, -17f, 17f, -17f)
            reflectiveCurveToRelative(17f, 7.611f, 17f, 17f)
            reflectiveCurveToRelative(-7.611f, 17f, -17f, 17f)
            reflectiveCurveTo(7f, 36.389f, 7f, 27f)
            close()
            moveToRelative(15.75f, -0.25f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(9.5f)
            close()
            moveToRelative(13.616f, -16.384f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            close()
        }
    }.build()
}
