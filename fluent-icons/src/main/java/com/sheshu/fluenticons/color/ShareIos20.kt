package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ShareIos20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ShareIos20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.282523f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0078D4)
                ),
                center = Offset(1.37129f, -2.14168f),
                radius = 25.4447f
            )
        ) {
            moveTo(10.287f, 2.057f)
            curveTo(10.2f, 2.02f, 10.102f, 2f, 10f, 2f)
            curveTo(9.898f, 2f, 9.801f, 2.02f, 9.713f, 2.057f)
            curveTo(9.624f, 2.094f, 9.542f, 2.147f, 9.47f, 2.22f)
            lineTo(5.22f, 6.47f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2.97f, -2.97f)
            verticalLineToRelative(7.69f)
            curveTo(9.25f, 12.664f, 9.586f, 13f, 10f, 13f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.56f)
            lineToRelative(2.97f, 2.97f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-4.25f, -4.25f)
            curveToRelative(-0.072f, -0.072f, -0.154f, -0.127f, -0.243f, -0.163f)
            close()
            moveTo(3.75f, 9f)
            curveTo(4.164f, 9f, 4.5f, 9.336f, 4.5f, 9.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-4f)
            curveTo(15.5f, 9.336f, 15.836f, 9f, 16.25f, 9f)
            reflectiveCurveTo(17f, 9.336f, 17f, 9.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(4.455f, 17f, 3f, 15.545f, 3f, 13.75f)
            verticalLineToRelative(-4f)
            curveTo(3f, 9.336f, 3.336f, 9f, 3.75f, 9f)
            close()
        }
    }.build()
}
