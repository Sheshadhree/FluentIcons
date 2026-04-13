package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTrending12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTrending12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 1.5f)
            curveTo(5.836f, 1.5f, 5.5f, 1.836f, 5.5f, 2.25f)
            reflectiveCurveTo(5.836f, 3f, 6.25f, 3f)
            horizontalLineToRelative(2.323f)
            lineTo(5.97f, 5.91f)
            lineTo(5.03f, 4.97f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(1.22f, 7.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(4.5f, 6.56f)
            lineToRelative(0.97f, 0.97f)
            curveToRelative(0.145f, 0.146f, 0.345f, 0.225f, 0.55f, 0.22f)
            curveToRelative(0.208f, -0.006f, 0.403f, -0.096f, 0.54f, -0.25f)
            lineTo(9.5f, 4.213f)
            verticalLineTo(6.25f)
            curveTo(9.5f, 6.664f, 9.836f, 7f, 10.25f, 7f)
            reflectiveCurveTo(11f, 6.664f, 11f, 6.25f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
