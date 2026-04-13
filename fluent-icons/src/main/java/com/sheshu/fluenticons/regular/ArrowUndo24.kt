package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUndo24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUndo24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 2f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(5.5f, 2.75f)
            verticalLineToRelative(5.69f)
            lineToRelative(4.574f, -4.56f)
            curveToRelative(2.442f, -2.442f, 6.365f, -2.501f, 8.879f, -0.179f)
            lineToRelative(0.186f, 0.18f)
            curveToRelative(2.503f, 2.502f, 2.503f, 6.56f, 0f, 9.063f)
            lineToRelative(-8.846f, 8.84f)
            curveToRelative(-0.293f, 0.292f, -0.767f, 0.292f, -1.06f, -0.001f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            lineToRelative(8.845f, -8.84f)
            curveToRelative(1.917f, -1.917f, 1.917f, -5.025f, 0f, -6.942f)
            curveToRelative(-1.86f, -1.86f, -4.838f, -1.916f, -6.766f, -0.168f)
            lineToRelative(-0.178f, 0.169f)
            lineTo(6.562f, 9.5f)
            horizontalLineToRelative(5.688f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(13f, 10.25f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(12.25f, 11f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(4f, 10.25f)
            verticalLineToRelative(-7.5f)
            curveTo(4f, 2.336f, 4.336f, 2f, 4.75f, 2f)
            close()
        }
    }.build()
}
