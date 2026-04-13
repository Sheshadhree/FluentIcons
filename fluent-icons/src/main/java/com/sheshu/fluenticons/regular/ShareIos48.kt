package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShareIos48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareIos48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.116f, 4.366f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(11.5f, 11.5f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineTo(25.25f, 8.268f)
            verticalLineTo(30.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(8.268f)
            lineToRelative(-9.366f, 9.366f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(11.5f, -11.5f)
            close()
            moveTo(7.25f, 22f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-12.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveTo(42f, 22.56f, 42f, 23.25f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 42f, 6f, 39.202f, 6f, 35.75f)
            verticalLineToRelative(-12.5f)
            curveTo(6f, 22.56f, 6.56f, 22f, 7.25f, 22f)
            close()
        }
    }.build()
}
