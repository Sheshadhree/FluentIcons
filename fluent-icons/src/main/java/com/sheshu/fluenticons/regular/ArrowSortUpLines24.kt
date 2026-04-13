package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortUpLines24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortUpLines24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 21.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.56f)
            lineToRelative(-2.22f, 2.22f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineTo(18f, 4.56f)
            verticalLineToRelative(16.69f)
            close()
            moveTo(2.75f, 19.5f)
            curveTo(2.336f, 19.5f, 2f, 19.164f, 2f, 18.75f)
            reflectiveCurveTo(2.336f, 18f, 2.75f, 18f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            close()
            moveTo(6f, 14.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.664f, 14f, 13.25f, 14f)
            horizontalLineToRelative(-6.5f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            close()
            moveToRelative(4.75f, -3.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(10.336f, 10f, 10.75f, 10f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
