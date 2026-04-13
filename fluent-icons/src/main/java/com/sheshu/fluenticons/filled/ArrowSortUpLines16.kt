package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSortUpLines16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortUpLines16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 14.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(3.56f)
            lineToRelative(-0.72f, 0.72f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2f, -2f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineTo(13f, 3.56f)
            verticalLineToRelative(10.69f)
            close()
            moveTo(2.75f, 13.5f)
            curveTo(2.336f, 13.5f, 2f, 13.164f, 2f, 12.75f)
            reflectiveCurveTo(2.336f, 12f, 2.75f, 12f)
            horizontalLineToRelative(6.5f)
            curveTo(9.664f, 12f, 10f, 12.336f, 10f, 12.75f)
            reflectiveCurveTo(9.664f, 13.5f, 9.25f, 13.5f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(2f, -3f)
            curveTo(4.336f, 10.5f, 4f, 10.164f, 4f, 9.75f)
            reflectiveCurveTo(4.336f, 9f, 4.75f, 9f)
            horizontalLineToRelative(4.5f)
            curveTo(9.664f, 9f, 10f, 9.336f, 10f, 9.75f)
            reflectiveCurveTo(9.664f, 10.5f, 9.25f, 10.5f)
            horizontalLineToRelative(-4.5f)
            close()
            moveTo(6f, 6.75f)
            curveTo(6f, 7.164f, 6.336f, 7.5f, 6.75f, 7.5f)
            horizontalLineToRelative(2.5f)
            curveTo(9.664f, 7.5f, 10f, 7.164f, 10f, 6.75f)
            reflectiveCurveTo(9.664f, 6f, 9.25f, 6f)
            horizontalLineToRelative(-2.5f)
            curveTo(6.336f, 6f, 6f, 6.336f, 6f, 6.75f)
            close()
        }
    }.build()
}
