package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSortDownLines16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortDownLines16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 1.75f)
            curveTo(13f, 1.336f, 12.664f, 1f, 12.25f, 1f)
            reflectiveCurveTo(11.5f, 1.336f, 11.5f, 1.75f)
            verticalLineToRelative(10.69f)
            lineToRelative(-0.72f, -0.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2f, 2f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(13f, 12.44f)
            verticalLineTo(1.75f)
            close()
            moveTo(2.75f, 2.5f)
            curveTo(2.336f, 2.5f, 2f, 2.836f, 2f, 3.25f)
            reflectiveCurveTo(2.336f, 4f, 2.75f, 4f)
            horizontalLineToRelative(6.5f)
            curveTo(9.664f, 4f, 10f, 3.664f, 10f, 3.25f)
            reflectiveCurveTo(9.664f, 2.5f, 9.25f, 2.5f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(2f, 3f)
            curveTo(4.336f, 5.5f, 4f, 5.836f, 4f, 6.25f)
            reflectiveCurveTo(4.336f, 7f, 4.75f, 7f)
            horizontalLineToRelative(4.5f)
            curveTo(9.664f, 7f, 10f, 6.664f, 10f, 6.25f)
            reflectiveCurveTo(9.664f, 5.5f, 9.25f, 5.5f)
            horizontalLineToRelative(-4.5f)
            close()
            moveTo(6f, 9.25f)
            curveTo(6f, 8.836f, 6.336f, 8.5f, 6.75f, 8.5f)
            horizontalLineToRelative(2.5f)
            curveTo(9.664f, 8.5f, 10f, 8.836f, 10f, 9.25f)
            reflectiveCurveTo(9.664f, 10f, 9.25f, 10f)
            horizontalLineToRelative(-2.5f)
            curveTo(6.336f, 10f, 6f, 9.664f, 6f, 9.25f)
            close()
        }
    }.build()
}
