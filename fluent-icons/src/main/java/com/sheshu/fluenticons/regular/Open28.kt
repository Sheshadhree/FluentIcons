package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Open28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Open28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 4.5f)
            curveTo(5.731f, 4.5f, 4.5f, 5.731f, 4.5f, 7.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(25f, 15.836f, 25f, 16.25f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(7.25f)
            curveTo(4.903f, 25f, 3f, 23.097f, 3f, 20.75f)
            verticalLineTo(7.25f)
            curveTo(3f, 4.903f, 4.903f, 3f, 7.25f, 3f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(12.164f, 4.5f, 11.75f, 4.5f)
            horizontalLineToRelative(-4.5f)
            close()
            moveToRelative(8.25f, -0.75f)
            curveTo(15.5f, 3.336f, 15.836f, 3f, 16.25f, 3f)
            horizontalLineToRelative(8f)
            curveTo(24.664f, 3f, 25f, 3.336f, 25f, 3.75f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(5.56f)
            lineToRelative(-6.22f, 6.22f)
            curveToRelative(-0.292f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            lineToRelative(6.22f, -6.22f)
            horizontalLineToRelative(-6.19f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
