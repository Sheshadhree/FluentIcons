package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowForward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowForward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.72f, 6.28f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(5f, 5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.72f, -3.72f)
            horizontalLineToRelative(-7.69f)
            curveToRelative(-3.452f, 0f, -6.25f, 2.798f, -6.25f, 6.25f)
            verticalLineToRelative(0.5f)
            curveTo(4.5f, 18.664f, 4.164f, 19f, 3.75f, 19f)
            reflectiveCurveTo(3f, 18.664f, 3f, 18.25f)
            verticalLineToRelative(-0.5f)
            curveTo(3f, 13.47f, 6.47f, 10f, 10.75f, 10f)
            horizontalLineToRelative(7.69f)
            lineToRelative(-3.72f, -3.72f)
            close()
        }
    }.build()
}
