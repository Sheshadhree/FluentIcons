package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortDownLines24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortDownLines24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 2.75f)
            curveTo(18f, 2.336f, 17.664f, 2f, 17.25f, 2f)
            reflectiveCurveTo(16.5f, 2.336f, 16.5f, 2.75f)
            verticalLineToRelative(16.69f)
            lineToRelative(-2.22f, -2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(18f, 19.44f)
            verticalLineTo(2.75f)
            close()
            moveTo(2.75f, 4.5f)
            curveTo(2.336f, 4.5f, 2f, 4.836f, 2f, 5.25f)
            reflectiveCurveTo(2.336f, 6f, 2.75f, 6f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 6f, 14f, 5.664f, 14f, 5.25f)
            reflectiveCurveTo(13.664f, 4.5f, 13.25f, 4.5f)
            horizontalLineTo(2.75f)
            close()
            moveTo(6f, 9.25f)
            curveTo(6f, 8.836f, 6.336f, 8.5f, 6.75f, 8.5f)
            horizontalLineToRelative(6.5f)
            curveTo(13.664f, 8.5f, 14f, 8.836f, 14f, 9.25f)
            reflectiveCurveTo(13.664f, 10f, 13.25f, 10f)
            horizontalLineToRelative(-6.5f)
            curveTo(6.336f, 10f, 6f, 9.664f, 6f, 9.25f)
            close()
            moveToRelative(4.75f, 3.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(10.336f, 14f, 10.75f, 14f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
